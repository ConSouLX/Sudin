public class ToolBox {
    static String name="Toolbox";
    static String material="Heavy-duty steel construction ensures durability and long-lasting performance for all your tool storage needs";
    static String compartments="Multiple compartments designed for organized storage of hand tools power tools and accessories";
    static String portability="Ergonomic handle and lightweight design allow for easy transportation to job sites or workshops";
    static String security="Secure locking mechanism provides added protection for your tools and prevents unauthorized access";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Material "+material);
        System.out.println("Compartments "+compartments);
        System.out.println("Portability "+portability);
        System.out.println("Security "+security);
        System.out.println("AFTER UPDATE");
        name="Toolbox Pro";
        material="Heavy-duty steel and reinforced plastic combination for enhanced durability and impact resistance";
        compartments="Expanded compartments with customizable dividers for better organization and easy access to tools";
        portability="Ergonomic handle with rubber grip and built-in wheels for effortless mobility";
        security="Dual-locking system with key and combination lock for enhanced security and peace of mind";
        System.out.println("name is "+name);
        System.out.println("Material "+material);
        System.out.println("Compartments "+compartments);
        System.out.println("Portability "+portability);
        System.out.println("Security "+security);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Material "+material);
        System.out.println("Compartments "+compartments);
        System.out.println("Portability "+portability);
        System.out.println("Security "+security);
    }
    public static void afterUpdate() {
        name="Toolbox Pro";
        material="Heavy-duty steel and reinforced plastic combination for enhanced durability and impact resistance";
        compartments="Expanded compartments with customizable dividers for better organization and easy access to tools";
        portability="Ergonomic handle with rubber grip and built-in wheels for effortless mobility";
        security="Dual-locking system with key and combination lock for enhanced security and peace of mind";
    }
}
