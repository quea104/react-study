package kr.re.kitri.reactive.rxjava.rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class RxJava005 {
    public static void main(String[] args) {
        // Single: 하나의 아이템 갖을 수 있음 => '무조건 한 개 데이터를 갖고 있다'라고 명시된 것임.
        // 하나의 데이터를 처리할 때는 Single로 선언해줘야 함. (주로 Web 에서 많이 사용함)
        // subscribe - 첫번째 파라미터: onSuccess / 두번째 파라미터: onError
        Single.just("only one")
                .subscribe(data -> System.out.println(data)
                        , error -> System.out.println(error));

        Observable<String> just = Observable.just("one", "two");
        
        // 데이터가 없을 경우 defaultItem 지정하여 전달
        Single<String> nil = just.first("Nil");
    }
}
