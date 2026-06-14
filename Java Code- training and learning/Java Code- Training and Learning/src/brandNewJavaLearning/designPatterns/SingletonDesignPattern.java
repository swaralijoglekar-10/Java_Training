package brandNewJavaLearning.designPatterns;

// Only one government

// Singleton design pattern
class GovernmentOfIndia{
    static GovernmentOfIndia governmentOfIndia = new GovernmentOfIndia();

    // static keyword here-guarantees that only one instance of the class exists
    // and is shared across all calls to getInstance()

    private GovernmentOfIndia(){
    }

    public static GovernmentOfIndia getInstance(){
        return governmentOfIndia;
    }

}

class India{
    public static void main(String[] args) {

        GovernmentOfIndia govt1 = GovernmentOfIndia.getInstance();
        GovernmentOfIndia govt2 = GovernmentOfIndia.getInstance();

        System.out.println(govt1 == govt2);  // true

    }
}
