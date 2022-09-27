import interfaces.Operation;
import interfaces.OperationImpl;



public class Main {
    public static void main(String[] args) {

        Operation operation = new OperationImpl();

        operation.getSort();
        System.out.println();


        operation.getInfo();

        }
    }


