public class Main {
    public static void main(String[] args) {
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        AgricultureCreditManager agricultureCreditManager = new AgricultureCreditManager();

        CreditUI creditUI = new CreditUI();
        creditUI.CrediCalculate(new TeacherCreditManager());
        creditUI.CrediCalculate(new AgricultureCreditManager());
        creditUI.CrediCalculate(new SoldierCreditManager());
    }
}