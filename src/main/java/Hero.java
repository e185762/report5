public class Hero extends LivingThing{

    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        int hitPoint = getHitPoint();
        String name = getName();

        hitPoint -= damage;
        setHitPoint(hitPoint);
        if (hitPoint < 0) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

}