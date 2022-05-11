package kr.re.kitri.reactive.rxjava.rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class RxJava002 {
    public static void main(String[] args) {
        // Producer
        Observable<String> stringObservable =
                Observable.just("red", "blue", "pink", "gray");

        // Consumer
        // Observer 타입의 객체 삽입
        stringObservable.subscribe(new MyObserver());
    }
}

// Observer 인터페이스
// 추상 메소드 구현
class MyObserver implements Observer<String> {
    // Consumer가 구독하겠다고 최초로 알림 - 구독자로 등록
    @Override
    public void onSubscribe(@NonNull Disposable d) {
        System.out.println("onSubscribe Callback");
    }

    // 데이터를 줄 때마다 onNext 실행, s 파라미터를 넘김.
    @Override
    public void onNext(@NonNull String s) {
        System.out.println("onNext Callback : " + s);
    }

    // 에러 발생시 에러를 e 파라미터로 넘김.
    @Override
    public void onError(@NonNull Throwable e) {
        System.out.println("onError Callback : " + e);
    }

    // 데이터 전송 완료 - 끝났다고 알림
    @Override
    public void onComplete() {
        System.out.println("onComplete Callback");
    }
}
