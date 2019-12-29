package jp.hirohiso.effectiveJava.ch1;

public class ObjectCreateDestroy {

    public static void main(String[] args) {
        {
            // 項目１:コンストラクタの代わりに static ファクトリーメソッドを検討する

            //インスタンスを新たに生成する
            Boolean a = new Boolean(false);
            //インスタンスを新たに生成せずに、すでにあるものを使いまわす
            Boolean b = Boolean.valueOf(false);
            //Integerも-127～ある一定の数までインスタンスを生成して、キャッシュをもってる。
            Integer.valueOf(1);

            //イミュータブルのため、使いまわしたほうがよい。
        }

    }


}
