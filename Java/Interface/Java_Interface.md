[인터페이스 이야기 03/23](https://velog.io/@hye_b/TIL-Interface)

# Interface 이야기

## 1. Interface의 기능
### (1) 구현을 강제한다.

```java
// interface는 모든 메소드가 추상 메소드(구현부가 없다.)
interface Runnable {
	void run();
}

public class Main implements Runnable{
	public static void main(String[] args){
    	// Main m = new Main();
        Runnable m = new Main();
        m.run();
    }
    
    @Override
    public void run(){
    	System.out.println("RUN!!");
    }
}
```

### (2) 다형성을 제공

```java
// interface는 모든 메소드가 추상 메소드(구현부가 없다.)
interface A {
	void ARun();
}

interface B{
	void BRun();
}
public class Main implements A, B {
	public static void main(String[] args){
    	Main m = new Main(); // 둘다 호출 가능 
        m.ARun();
        m.BRun();
        A Am = new Main(); // ARun만 호출 가능 
        BRunnable Bm = new Main(); // B만 호출 가능 
    }
    
    @Override
    public void ARun(){
    	System.out.println("A!!");
    }
    
     @Override
    public void BRun(){
    	System.out.println("B!!");
    }
}
```

### (3) 결합도를 낮추는 효과(의존성을 역전)

## 2. default Method 기능
- Java 8 이상부터 기능 개선이 있었음
- 인터페이스가 구현체를 가질 수 있게 되었다.
- default 메소드가 생겨서 adapter 역활
- 인터페이스 추가만으로 기능을 확장할 수 있다.
- static 메소드를 가질 수 있게 되었다. : 함수 제공자 

## 3. Functional Interface
- 추상메소드가 하나만 존재하는 인터페이스
- @FunctionalInterface 를 달아준다.

## 4. 인터페이스 임시 생성
- 익명 클래스를 사용해서 인터페이스의 인스턴스를 생성하고 구현을 즉시 정의한다.

## 5. Lambda
- 익명 메소드를 사용해서 간결한 인터페이스 인스턴스를 생성하는 방법
- FunctionalInterface에서만 가능
- 간결하게 표현이 가능 

## 5.1 메소드 레퍼런스
- 람다 표현식에서 입력되는 값을 변경없이 바로 사용하는 경우 
- 최종으로 적용될 메소드의 레퍼런스를 지정해주는 표현 방식 
- 개발자의 개입을 차단함으로써 안정성을 얻을 수 있다.

### Predicate
- 매개변수 o, 반환값 o
- 매개변수값을 조건에 따라 논리값으로 반환

``` java
Predicate<Integer> p = i -> i % 2 == 0;
Predicate<String> p1 = str -> str.length() != 0;
```
### Consumer
- 매개변수 o , void 
- 매개변수를 받아서 소비

```java
@FunctionalInterface
interface MyConsumer {
	void accept(String str);
}

// consumer 
// Consumer<String> c = (str) -> System.out.println(str);
Consumer<String> c = System.out::println;
c.accept(10);
```
