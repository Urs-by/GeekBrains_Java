package HomeWork6;

public class Laptop {
    private String product;
    private Float inches;
    public String cpu;
    private Integer ramGb;
    private String memoryType;
    private Integer romGb;
    private Float weight;


    // инициализатор
    {
        product = null;
        inches = 11.0f;
        cpu = null;
        ramGb = 2;
        memoryType = null;
        romGb = 0;
        weight = 0f;

    }

    // конструкторы
    public Laptop() {
    }

    public Laptop(String product, Float inches, String cpu, Integer ramGb, String memoryType, Integer romGb, Float weight) {
        this.product = product;
        this.inches = inches;
        this.cpu = cpu;
        this.ramGb = ramGb;
        this.memoryType = memoryType;
        this.romGb = romGb;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return String.format("Производитель: %s , Диагональ: %s , Процессор: %s , ОЗУ: %s Гб, Жесткий диск: %s - %s Гб, Вес: %s кг.\n",
                product, inches, cpu, ramGb, memoryType, romGb, weight);
    }

    public void InfoStringLaptop(String arg) {
        if (filterProduct(arg) || filterMemory(arg))
            System.out.printf("Производитель: %s , Диагональ: %s , Процессор: %s , ОЗУ: %s Гб, Жесткий диск: %s - %s Гб, Вес: %s кг.\n",
                    product, inches, cpu, ramGb, memoryType, romGb, weight);
    }

    public void infoFloatLaptop(Float arg) {
        if (filterInch(arg)) {
            System.out.printf("Производитель: %s , Диагональ: %s , Процессор: %s , ОЗУ: %s Гб, Жесткий диск: %s - %s Гб, Вес: %s кг.\n",
                    product, inches, cpu, ramGb, memoryType, romGb, weight);
        }
    }

    public void infoRamLaptop(Integer arg) {
        if (filterRam(arg)) {
            System.out.printf("Производитель: %s , Диагональ: %s , Процессор: %s , ОЗУ: %s Гб, Жесткий диск: %s - %s Гб, Вес: %s кг.\n",
                    product, inches, cpu, ramGb, memoryType, romGb, weight);
        }
    }

    public void infoRomLaptop(Integer arg) {
        if (filterRom(arg)) {
            System.out.printf("Производитель: %s , Диагональ: %s , Процессор: %s , ОЗУ: %s Гб, Жесткий диск: %s - %s Гб, Вес: %s кг.\n",
                    product, inches, cpu, ramGb, memoryType, romGb, weight);
        }
    }

    private boolean filterProduct(String arg) {
        return product.equals(arg);
    }

    private boolean filterMemory(String arg) {
        return memoryType.equals(arg);
    }

    private boolean filterInch(Float arg) {
        return inches >= arg;
    }

    private boolean filterRam(Integer arg) {
        return ramGb >= arg;
    }

    private boolean filterRom(Integer arg) {
        return romGb >= arg;
    }

}
