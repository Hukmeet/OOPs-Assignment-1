class CheckedCustomException extends Exception {
    public CheckedCustomException(String msg) { super(msg); }
}
class SubCheckedCustomException extends CheckedCustomException {
    public SubCheckedCustomException(String msg) { super(msg); }
}
class UncheckedCustomException extends RuntimeException {
    public UncheckedCustomException(String msg) { super(msg); }
}
class SuperClass {
    public void executeTask() throws CheckedCustomException {
        System.out.print("[SUPER] Executing Task: ");
        throw new CheckedCustomException("SuperClass declared and threw its checked exception.");
    }
}
class SubClassNoChecked extends SuperClass {    
    @Override
    public void executeTask() { // Notice: No 'throws' declaration (Legal)
        System.out.println("[SUB 1] Overriding. This method throws NO checked exception (LEGAL).");
    }
}
class SubClassThrowUnchecked extends SuperClass {    
    @Override
    public void executeTask() { // Notice: No 'throws' needed for unchecked (Legal)
        System.out.print("[SUB 2] Overriding. ");
        System.out.println("Throwing UncheckedCustomException (LEGAL).");
        throw new UncheckedCustomException("SubClass threw a new UNCHECKED exception.");
    }
}
class SubClassSubChecked extends SuperClass {    
    @Override
    public void executeTask() throws SubCheckedCustomException { // Throws a narrower exception (Legal)
        System.out.print("[SUB 3] Overriding. ");
        System.out.println("Throwing SubCheckedCustomException (LEGAL).");
        throw new SubCheckedCustomException("SubClass threw a subclass of parent's checked exception.");
    }
}
public class R50_All_Cases_Of_Exception_Handling {    
    public static void main(String[] args) {
        System.out.println("--- Exception Overriding Rules Demo (Simplified) ---");
        SubClassNoChecked test1 = new SubClassNoChecked();
        System.out.println("\n--- Test 1: SubClass removes checked exception (Legal) ---");
        test1.executeTask(); 
        System.out.println("\n--- Test 2: SubClass throws a new UNCHECKED exception ---");
        SubClassThrowUnchecked test2 = new SubClassThrowUnchecked();
        try {
            test2.executeTask(); 
        } 
        catch (UncheckedCustomException e) {
            System.out.println("Successfully caught UncheckedCustomException: " + e.getMessage());
        }
        System.out.println("\n--- Test 3: SubClass throws a SUBCLASS of the parent's checked exception ---");
        SubClassSubChecked test3 = new SubClassSubChecked();
        try {
            test3.executeTask();
        } 
        catch (CheckedCustomException e) { 
            System.out.println("Successfully caught the exception (Type: " + e.getClass().getSimpleName() + "): " + e.getMessage());
        }
        System.out.println("\nDemonstration complete.");
    }
}