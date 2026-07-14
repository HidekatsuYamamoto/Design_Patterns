//  Aggregateインタフェース
//  数え上げを行うものの「集合体」を表します。このインタフェースを実装しているクラスは、配列のように「何かがたくさん集まっているもの」になります。
//  Iterator役を作り出すインタフェースを定める。
//  https://english-battle.com/word/aggregate

public interface Aggregate {
    public abstract Iterator iterator();
}

// Aggregateインタフェースで宣言されているメソッドは、iteratorメソッドです。
// このメソッドは、集合体に対応するIteratorを１個作成するためのものです。
// 集合体を数えたい。スキャンしたい。１つずつ調べていきたいというときは、
// このiteratorメソッドを使ってIteratorインタフェースを実装したクラスの
// インスタンスを1個作ります。
