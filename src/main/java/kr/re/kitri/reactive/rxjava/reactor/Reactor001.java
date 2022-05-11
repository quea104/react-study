package kr.re.kitri.reactive.rxjava.reactor;

import reactor.core.publisher.Flux;

import java.util.function.Function;
import java.util.function.Predicate;

public class Reactor001 {
    public static void main(String[] args) {
        // Pipeline : 작업이 순차적, 독립적으로 실행이 됨
        /*Flux.just("blue", "pink", "red")
                .filter(data->data.length() >= 4) // filter를 한 새로운 Flux<String> 생성
                .map(data -> data.toUpperCase()) // mapping 새로운 Flux<String> 생성
                .subscribe(data -> System.out.println(data)); // 데이터 사용*/

        // Functional Programming (함수형 프로그래밍)
        //  : 객체지향 + 함수, 빅데이터를 손쉽게 프로그래밍 하기 위한 프로그래밍 패러다임

        /*Flux.just("blue", "pink", "red")
                .filter(new MyInterface())
                .map(new MyFunction())
                .subscribe(data -> System.out.println(data));*/

        //  : 람다식(= Single Abstract Method(SAM): 1개의 추상 메소드를 갖고 있는 인터페이스)으로 프로그래밍
        //      -> 함수를 파라미터로 넘김
        // Java7 타입 추론 엔진: 파라미터 타입 자동 추론
        Flux.just("blue", "pink", "red")
                .filter(s -> s.length() > 4)
                .map(String::toUpperCase) // Method Reference 방식
                .subscribe(System.out::println);
    }
}

// filter - Predicate: 데이터가 조건에 의해 참거짓 판별
class MyInterface implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.length() > 4;
    }
}
// map - Function: A 입력하여 B 출력, 값을 반환해야 함
class MyFunction implements Function<String, String> {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}

// 추상메소드가 한 개만 있다고 지칭
/*@FunctionalInterface // -Annotation
interface MyInterface {
    // (public static)
    int A = 3; // 상수 의미

    // (public abstract)
    int myFunction();
}*/
