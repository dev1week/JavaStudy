package DesignPattern.Singleton;

public class CompanyTest {
    public static void main(String[] args){
        Company company = Company.getInstance(); 
        Company anotherCompany = Company.getInstance(); 

        // 두개의 서로다른 객체를 생성한 것 처럼 보여도 결국 같은 객체임 
        System.out.print(company);
        System.out.print(anotherCompany);

    }
    
}
