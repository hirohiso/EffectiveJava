package jp.hirohiso.effectiveJava.ch1;

public class ObjectCreateDestroy {

    public static void main(String[] args) {
        // 項目１:コンストラクタの代わりに static ファクトリーメソッドを検討する

        //インスタンスを新たに生成する
        Boolean a = new Boolean(false);
        //インスタンスを新たに生成せずに、すでにあるものを使いまわす
        Boolean b = Boolean.valueOf(false);

        //イミュータブルのため、使いまわしたほうがよい。

    }

}
