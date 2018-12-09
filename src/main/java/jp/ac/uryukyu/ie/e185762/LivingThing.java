package jp.ac.uryukyu.ie.e185762;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    boolean dead;

    /**フィールド関数に変数の値をそれぞれセットするコンストラクタ。
     *
     * @param name　フィールド関数「name」に代入したい値。
     * @param hitPoint　フィールド関数「hitPoint」に代入したい値。
     * @param attack　フィールド関数「attack」に代入したい値。
     */
    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }
    public boolean getDead(){
        return dead;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public boolean isDead() {
        return dead;
    }


    /**ダメージ表記を出力するメソッド。
     *
     * @param opponent　変数「name」と対になるキャラクタの名前。
     */
    public void attack(LivingThing opponent) {
        if (this.dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**ダメージ計算と死亡判定を行うメソッド。
     *
     * @param damage　ダメージの値。attack(LivingThing opponent)で算出した変数「damage」の値を代入する。
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}