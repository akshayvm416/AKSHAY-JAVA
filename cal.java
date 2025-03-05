public class cal {
        int num = 4;
    
        public int add(int n1, int n2) {
            return n1 + n2;
        }
    
        public static void main(String[] args) {
            int data = 10; // Unused variable
    
            cal obj1 = new cal();
            int r1 = obj1.add(3, 4); // Call the add method using obj1
    
            System.out.println(r1);
        }
    }
    
    

