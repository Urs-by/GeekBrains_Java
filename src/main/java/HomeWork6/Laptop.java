package HomeWork6;

public class Laptop {
    private String company;
    private String product;
    private String typeName;
    private Float inches;
    private String cpu;
    private Integer ramGb;
    private String opSys;
    private Float weight;

    // инициализатор
    {
        company = null;
        product = null;
        typeName = null;
        inches = 10.5F;
        cpu = null;
        ramGb = 4;
        opSys = null;
        weight = 1.0F;
    }

    // конструктор
    public Laptop() {
    }

    public Laptop(String company,
                  String product,
                  String typeName,
                  Float inches,
                  String cpu,
                  Integer ramGb,
                  String opSys,
                  Float weight) {
        this.company = company;
        this.product = product;
        this.typeName = typeName;
        this.inches = inches;
        this.cpu = cpu;
        this.ramGb = ramGb;
        this.opSys = opSys;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Производитель: %s \n" +
                "Продукт: %s \n" +
                "Тип: %s \n" +
                "Диагональ: %s \n" +
                "Процессор:%s \n" +
                "ОЗУ: %s  Гб\n" +
                "Операционная система: %s \n" +
                "Вес: %s гр.\n", company, product, typeName, inches, cpu, ramGb, opSys, weight);
    }

    public void infoLaptop() {
        System.out.printf("Производитель: %s \n" +
                "Продукт: %s \n" +
                "Тип: %s \n" +
                "Диагональ: %s \n" +
                "Процессор: %s \n" +
                "ОЗУ : %s Гб\n" +
                "Операционная система: %s \n" +
                "Вес: %s гр.\n", company, product, typeName, inches, cpu, ramGb, opSys, weight);
    }

}
