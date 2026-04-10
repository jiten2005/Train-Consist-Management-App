public class TrainConsistManagementApp {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie class
    static class GoodsBogie {
        String shape;   // Rectangular / Cylindrical
        String cargo;   // Petroleum / Coal / etc.

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Cargo assignment with try-catch-finally
        public void assignCargo(String cargoType) {
            try {
                // Unsafe condition
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargoType.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
                }

                // Safe assignment
                this.cargo = cargoType;
                System.out.println("Cargo assigned: " + cargoType);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Assignment attempt completed.");
            }
        }
    }

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");   // ✅ Safe

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");   // ❌ Unsafe

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");        // ✅ Safe

        System.out.println("Program continues safely...");
    }
}