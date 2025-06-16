public class PC {
    private String processor;
    private String memory;
    private String disk;
    private boolean wifiEnabled;

    
    private PC(PCBuilder builder) {
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.disk = builder.disk;
        this.wifiEnabled = builder.wifiEnabled;
    }

    public void displayInfo() {
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Disk: " + disk);
        System.out.println("WiFi Enabled: " + (wifiEnabled ? "Yes" : "No"));
    }

    public static class PCBuilder {
        private String processor;
        private String memory;
        private String disk;
        private boolean wifiEnabled;

        public PCBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public PCBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public PCBuilder disk(String disk) {
            this.disk = disk;
            return this;
        }

        public PCBuilder wifiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public PC build() {
            return new PC(this);
        }
    }
}
