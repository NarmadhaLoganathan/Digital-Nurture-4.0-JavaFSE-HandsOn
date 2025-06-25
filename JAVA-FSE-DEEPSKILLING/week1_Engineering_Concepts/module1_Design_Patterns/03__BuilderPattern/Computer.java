public class Computer {
   
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private boolean hasWiFi;

   
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.hasWiFi = builder.hasWiFi;
    }

    
    public String getSpecs() {
        return "CPU: " + cpu + ", RAM: " + ram + ", Storage: " + storage +
               ", Graphics: " + (graphicsCard != null ? graphicsCard : "None") +
               ", WiFi: " + (hasWiFi ? "Yes" : "No");
    }

    
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private boolean hasWiFi;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWiFiEnabled(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
