[초보개발자 03/21](https://velog.io/@hye_b/TIL-JAVA-%EC%B4%88%EB%B3%B4-%EA%B0%9C%EB%B0%9C%EC%9E%90)

## 📃 Java Coding Convention
1. 클래스명은 대문자로 시작한다.
	- class myClass {} (x)
    - class MyClass {} (O)
2. 메소드나 변수명은 소문자로 시작한다.(Camel)
	- int my_Variable = 0; (X)
    - int myVariable = 0; (O)
    - void GoHome() {} (X)
    - void goHome() {} (O)
3. Indent
	- Tab, Space를 섞어서 사용하면 안됨

## 🏠 Reference
- Java에서 모든것이 Reference 값이다.
- array는 reference는 아니지만 취급한다. 
- 예외 (Primitive)
    - byte
    - boolean
    - int
    - short
    - long
    - float
    - double
    - char
```java
int a = 100; // a는 100을 전달
Integer b = 100; // b는 Reference 값 전달
``` 
### 🔎 Reference 예제 코드 
1. main과 Method의 변수
![](https://images.velog.io/images/hye_b/post/0dd48c07-214e-4ba1-893f-42c1f2dc3bc6/image.png)
-> 실행시 결과는 100 이 나온다. 
-> main의 a와 dosomething의 a는 다른 변수이기 때문이다.  

2. 객체의 변수 
![](https://images.velog.io/images/hye_b/post/27677041-d24d-40f6-b275-5926fc1a4cd2/image.png)
-> 실행시 결과는 200이 나온다.
-> main문의 a와 Method의 Int a는 다른 객체이지만 같은 Object(Int)를 가르키고 있기 때문에 200으로 바뀐다. 

## 🚀Call by value vs Call by reference
- Call by value(value에 의한 호출)
=> 인자로 받은 값을 복사하여 보낸다. 
- Call by reference(reference에 의한 호출)
=> 인자로 받은 값의 주소를 보내어 직접 값에 영향을 준다.
=> **java에는 Call by reference가 없다 !** 


## 😋 Constant Pool
- String을 특별하게 취급한다. 
![](https://images.velog.io/images/hye_b/post/78151d0c-0e95-44aa-bd31-8302c9ea03bc/image.png)
[실행 결과]
![](https://images.velog.io/images/hye_b/post/3dc86b6d-11ae-4d3b-aee3-ad46e5849959/image.png)
[Constant Pool의 상태]
<img src="https://images.velog.io/images/hye_b/post/15768f16-621e-4cde-8aab-92b5c6d12186/image.png" width="400px" />
[String reference]
![](https://images.velog.io/images/hye_b/post/c604391a-12be-4bee-8b65-fc09cad48994/image.png)-> 차례대로 true, false, false  
-> 이미 Hello World는 Constant Pool에 등록되어있어서 b도 같은 Hello World를 가르키게 된다. 
-> new 키워드를 통해 값을 할당할 경우 Heap 영역에 동적으로 메모리 공간이 할당하게된다. 

### StringBuffer & StringBuilder
- **StringBuffer** : **동기화를 지원**하여 멀티쓰레드 환경에서 안전하다 (Thread-safe)
- **StringBuilder** : **동기화를 지원하지 않는다** 단일 쓰레드에서 성능은 Stringbuffer보다 뛰어나다. 

## 🍀 Object
- 모든 객체의 **최상위 객체**
- 모든 객체에는** Object를 상속**받게 되어있다. 
=> **모든 객체는 Object 메소드를 호출할 수 있다. **

### 🔍 Object의 메소드
- toString()
: 모든 객체의 정보를 문자열로 return 
- equals()
: 물리적으로 다른 메모리에 위치하는 객체들이 논리적으로 동일한지 비교해주는 메소드 
- hashCode()
: hashcode값이 같은지 확인하고 다르면 다른 객체로 판단하고, 같으면 equals로 다시 비교한다. 두 함수 결과가 모두 동등할때 같은 객체로 판단한다. 
## ⛄ Git
- git의 명령어를 외우기 보다는 어떻게 사용하는지 알아야한다. 
- Tool을 사용해서 활용하자.(github desktop, Sourcetree) 
### gitignore를 잘 활용해야한다.
- 빌드결과, 바이너리, 제너레이트 가능한 파일들, 로컬설정, 키/보안 설정 
- \*.class, \*.jar, build/
