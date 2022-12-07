package DesignPattern.Singleton;

// 객체가 단 하나만 만들어져야하는 경우 사용 

public class Company {
    //클래스 정의 
    //아무나 생성하지 못하도록 private 사용 
    private Company(){}
    //싱글톤 패턴을 적용한 클래스 안에서 미리 객체를 생성해 놓는다. 
    private static Company instance = new Company();
    
    
    // 객체를 생성하는 메서드는 객체를 생성하기 전에 실행되어야함
    // 따라서 static 메서드를 사용해야함 
    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance; 
    }
    
}
