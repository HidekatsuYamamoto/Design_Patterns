// Iteratorインタフェース
// 要素の数え上げを行うもの、ループ変数のような役割を果たすもの。
// 反復子
public interface Iterator {
    public abstract boolean hasNext();

    public abstract Object next();
}

// hasNext()
// 次の要素が存在するかどうかを調べるメソッド。
// return
// true : あり
// false : なし
//
// next()
// 次の要素を得るためのメソッド。
// return
// 次の要素
