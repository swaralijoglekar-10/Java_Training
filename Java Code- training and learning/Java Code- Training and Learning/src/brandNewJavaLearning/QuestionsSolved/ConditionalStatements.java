package brandNewJavaLearning.QuestionsSolved;

public class ConditionalStatements {
    public static void main(String[] args) {

        double gpa = 9.65;
        int attendancePercentage = 85;

        if(gpa>=3.5 && attendancePercentage>=90){
            System.out.println("Eligible for Scholarship A");
        }

        else if(gpa>=3.0 && attendancePercentage>=80){
            System.out.println("Eligible for Scholarship B");
        }

        else{
            System.out.println("Not eligible for any scholarship at this time.");
        }

        int number = 2;
        switch(number){
            case 1:
                System.out.println("Cheese cake");
                break;
            case 2:
                System.out.println("Muffin");
                break;
            case 3:
                System.out.println("Doughnut");
                break;
            default:
                System.out.println("Not available");
                break;
        }

    }
}
