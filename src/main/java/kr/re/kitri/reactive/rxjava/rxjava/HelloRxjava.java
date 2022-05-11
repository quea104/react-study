package kr.re.kitri.reactive.rxjava.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// https://github.com/soongon/reactive-2022

public class HelloRxjava {
    // emmet: psvm
    public static void main(String[] args) {
        // emmet: sout
        // System.out.println("Hello World");

        // java 에서 주로 데이터를 저장하는 Data Collection : List
        // Data Producer = Data Source = Observable(식별[관찰]할 수 있는) <= 제공자
        List<String> colors = Arrays.asList("blue", "red", "yellow", "white", "black");

        // Data Consumer = Data Subscriber = Observer(참관인,목격자,관찰자) <= 소비자, 구독자
        for(String color: colors) {
            if(color.length() > 4) { // 데이터 필터링
                System.out.println(color.toUpperCase()); // 데이터 가공
            }
        }
        // => 1. Imperative programming(명령형 프로그래밍) : 과거 프로그래밍 방식, 빅데이터 시대 이전

        //*******************************************************************************************************************//

        // 2. Declarative programming(선언형 프로그래밍) : Stream Library, Java 8(함수형 프로그래밍 지원)
        // JVM 최적화된 방식, 명령형 프로그래밍 내부 방식과 똑같고 코딩만 달라졌음.
        Stream<String> colorsStream = Stream.of("blue", "red", "yellow", "white", "black"); // Stream Data Collection 생성

        // 람다식: 람다(함수)를 파라미터로 받음, -> thin arrow
        colorsStream
                .filter(d -> d.length() > 4)
                .map(d -> d.toUpperCase())
                .forEach(d -> System.out.println(d));

        //*******************************************************************************************************************//

        // 3. Reactive Programing : RxJava (Reactor)
        // 비동기식으로 처리 하기 때문에 명령형 프로그래밍 내부 방식과도 다름.
        // mavenrepository(https://mvnrepository.com/search?q=rxjava) RxJava 검색
        // RxJava v1: 연구용, RxJava v2 이후: 정식으로 Reactive 프로그래밍 방식 따름

        // Data Producer
        Observable<String> just = Observable.just("blue", "red", "yellow", "white", "black");

        // Data Consumer
        just
                .filter(d -> d.length() > 4)
                .map(d -> d.toUpperCase())
                .subscribe(d -> System.out.println(d));

    }
}
