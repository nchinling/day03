public class GameMain {
    public static void main(String[] args){

        List<Hittable> enemies = new LinkedList<>{};

        for (int i = 0; i < 3; i++){
        enemies.add();
        }
        enemies.add(new Tree());
        enemies.add(new Gnome());

        // Tree fir = new Tree();

        Hittable h = new Tree();


        // for (int i = 0; i <enemies.size(); i++){
        //     System.out.printf("%d: %s\n", i,enemies.get(i));
        // }

        Link link = new Link();
        for(Troll t : enemies){
            link.hit(t);
            System.out.printf(">> %s\n", t);
        }
    }
}
