package groovy

/**
 * Created by Rafal on 02017-06-03.
 */
class WhoGetsTheCatch {
    int numberOfCatchers
    def catchers = new ArrayList<Catcher>()
    def venotoise = new Venotoise()

    static void main(String[] args) {
        def whoGetsTheCatch = new WhoGetsTheCatch()

        def scanner = new Scanner(System.in)

        whoGetsTheCatch.numberOfCatchers = scanner.nextInt()
        whoGetsTheCatch.venotoise.location = scanner.nextInt()

        for (int i = 0; i < whoGetsTheCatch.numberOfCatchers; i++) {
            whoGetsTheCatch.catchers.add(new Catcher())
            whoGetsTheCatch.catchers.get(i).location = scanner.nextInt()
        }
        for (int i = 0; i < whoGetsTheCatch.numberOfCatchers; i++) {
            whoGetsTheCatch.catchers.get(i).speed = scanner.nextInt()
        }

        def times = []
        for (int i = 0; i < whoGetsTheCatch.numberOfCatchers; i++) {
            times.add(
                    Math.abs(
                            whoGetsTheCatch.venotoise.location -
                                    whoGetsTheCatch.catchers.get(i).location
                    ) / whoGetsTheCatch.catchers.get(i).speed
            )
        }
        if (Collections.frequency(times, Collections.min(times)) > 1) {
            println "-1"
        }else {
            println times.indexOf(Collections.min(times))
        }
    }
}
