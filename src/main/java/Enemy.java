public class Enemy extends LivingThing{

    public Enemy (String name, int hitPoint, int attack) {
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
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }


}
