package var_type;

public class VarInitialization {

    public static void main(String[] args) {

        //변수 선언
        /*
        자바의 변수는 다양한 타입의 값을 저장할 수 없음
        타입(type)은 형,자료형으로도 불림
        타입은 변수에 저장되는 값의 종류와 범위를 결정짓는 요소이기 때문에 충분히 생각한 다음 결정
         */
        int age;  //정수(int)를 저장할 수 있는 변수 선언
        double value;  //실수(double)를 저장할 수 있는 변수 선언

        //같은 타입의 변수는 콤마(,)를 이용해서 한꺼번에 선언 가능
        int a,b,c;

        //값 저장
        /*
        변수에 값을 저장할 때는 대입 연산자(=)를 사용하며 오른쪽의 값을 왼쪽의 변수에 저장한다는 의미
        자바에서는 변수에 값이 저장되지 않으면 변수가 생성되지 않음, 선언과 생성은 다른 이야기
        변수 선언 : 저장되는 값의 종류와 이름만 언급한 것
        변수 생성,변수 초기화 : 변수에 최초로 값이 저장될 때 변수가 생성되며 이것을 변수 초기화라고 한다
        초기값 : 변수 초기화에 사용된 값을 초기값이라고 한다
        */
        int score;  //변수 선언
        score = 90;  //값 저장, 90이 초기값
        //초기값은 변수를 선언함과 동시에 제공할 수 있다
        int grade = 90;
        /*
        변수가 초기화되면 메모리 번지 정보를 갖게 되고, 해당 메모리 번지에 값이 저장됨
        초기화되지 않은 변수는 아직 메모리 번지 정보를 가지고 있지 않으므로 변수를 통해 메모리 값을 읽을 수 없다
         */

        //잘못된 예시
        /*
        변수 값을 읽고 10을 더해서 result에 저장,
        변수 number가 선언되었지만 초기화되지 않았기 때문에 변수 number는 존재하지 않는다 따라서 컴파일 에러가 발생

        int number;  //변수 선언
        int result = number + 10;
         */
        //올바른 코드
        int number = 30;  //변수 number가 30으로 초기화됨
        int result = number + 10;  //변수 number 값(30)을 읽고 10을 더해서 변수 result에 저장

        //변수 사용
        /*
        변수는 출력문이나 연산식 내부에서 변수에 저장된 값을 출력하거나 연산할 때 사용함
         */
        //printIn()메소드의 매개값에 변수를 사용하면 변수에 저장된 값을 사용해서 출력함
        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시간" + minute + "분");  //변수 hour와 minute 값을 출력 : 3시간 5분
        //변수는 또 다른 변수에 대입하여 값을 복사할 수 있음
        //변수 복사 예시 - 변수 x값을 변수 y 값으로 복사
        int x = 10;  //10을 저장
        int y = x;  //x에 저장된 값을 변수 y에 복사(저장)

        //두 변수의 값을 교환하는 방법
        //두 변수의 값을 교환하기 위해서 새로운 변수 temp를 선언함
        int case1 = 10;
        int case2 = 5;

        int temp = case1;
        case1 = case2;
        case2 = temp;

        //변수 사용 범위
        /*
        자바의 모든 변수는 중괄호 {}블록 내에서 선언되고 사용된다.
        메소드 블록 내에서 선언된 변수를 로컬 변수(local variable)라고 부르는데, 로컬 변수는 메소드 블록 내부에서만 사용되고 메소드 실행이 끝나면
        메모리에서 자동으로 없어진다.

        변수는 블록 내 어디서든 선언할 수 있지만, 변수 사용에는 제한이 따른다.
        변수는 자신이 선언된 블록 내부에서만 사용할 수 있다.
        if(){},for(){},while(){}등이 중괄호 블록을 가질 수 있는데 이러한 중괄호{} 블록 내에서 선언된 변수는 해당 중괄호{} 블록 내에서만
        사용 가능하고 밖에서는 사용할 수 없다.
        //예시
        public class VariableExam {

            public static void main(String[] args) {
                int var1 = 10;  //로컬 변수, 메소드 블록에서 선언
                if () {
                    int var2;  //if 블록에서 선언
                    //var1,var2 사용 가능
                }  //if 블록
                for() {
                    int var3;  //for 블록에서 선언
                    //var1,var3 사용 가능
                    //var2는 사용 불가
                }  //for 블록

                //var1 사용 가능
                //var2,var3는 사용 불가

            }  //메소드 블록

        }  //클래스 블록
         */

    }

}
