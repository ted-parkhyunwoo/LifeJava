package training.learning.T18_exception;

// 메인함수부터 읽으면 됨. 거꾸로 클래스 및 메서드를 찾아갈 것.


// TODO 사용자정의 예외클래스와 사용코드 작성할 것.


// 런타임예외한정: 상속(파생)받아 재정의 하는 경우는 throws객체가 상위예외를 가질 수 없다.
// 아래 코드는 실제로 에러를 일으키는 클래스가 아니지만, throws 처리하는 메서드 재정의시 어떤 결과가 나오는지 확인할 수 있다.
import java.io.IOException;
class Parent {
    public void func() throws IOException {
    }
}
class Child extends Parent {
    @Override
    public void func() throws IOException { // throws에 Exception을 넣으면 컴파일 오류.
    }
}


public class TryCatchFinally {
    // throws 예제. 메서드에 사용. 예측가능한 예외임을 경고, 처리할 코드를 catch에서 작성하도록 강제유도.
    // TODO unchecked exception은 사실 throws 하지 않아도 자동으로 전달됨. 예제 수정할 필요 있음.
    public static void func(int[] arr) throws NullPointerException {        // 참고로 static 하지 않으면 try안에선 못씀. 이게 싫다면 TryCatchFinally 클래스객체를 내부에서 생성하고 객체.func로 호출.
        System.out.println(arr[0]);
    }


    public static void main(String[] args) {
        int[] arr = {1};
        
        try {
            String str = new String("try에서 생성된 문자열객체");
            int[] myArray = null;
            Parent p = new Child();

            // TODO 컴파일타임,런타임 예외 분류를 살펴볼 것.

            // 아래 예외발생 코드들은 주석처리하면서 사용해볼것

            // System.out.println(arr[1]);     // ArrayIndexOutOfBoundsException: unchecked exception 발생코드
            func(myArray);                  // 메서드 throws 예외 처리: 널포인터예외 발생코드
            // Class.forName("name");            // ClassNotFoundException: exception(checked exception) 발생코드.
            //! 중요. Java에서는 '컴파일타임 예외클래스'를 catch로 적을 수 없음. - Exception에선 가능. 
            // ClassNotFoundException 예외처리 과정을 보려면 위 코드는 catch문에서도 주석처리/해제 하여야함. 

            
            p.func();

            

        } catch (NullPointerException e) {
            System.out.println("널포인터 예외처리됨.");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            // unchecked exception : 런타임중에 발생하는 예외. 컴파일은 가능
            System.out.println("배열접근범위초과예외 처리됨.");
            e.printStackTrace();        // 예외객체.printStackTrace() 는 예외문 출력.
        } 

        /* catch (ClassNotFoundException e) {
            // checked exception: 컴파일 타임에 미리 경고되며, 처리하지 않으면 컴파일되지않음.
            e.printStackTrace();        // 예외경고문이 장황하나, 사실상 마지막줄만 해당됨.
        } 
            */
        
        catch (Exception e) {
            System.out.println("나머지 모든 예외처리.");        // catch문 순서에 주의. 이것이 상위로 가면 문제여지가 많음.
            e.printStackTrace();
        } finally {
            // 여기서 str등 할당공간은 회수됨.
            System.out.println("try에서 할당된 자원 환원 완료");
        }
    }
}
