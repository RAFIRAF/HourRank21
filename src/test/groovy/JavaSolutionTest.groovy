import spock.lang.*

/**
 * Created by Rafal on 02017-06-03.
 */
class JavaSolutionTest extends Specification {

    def "test who Gets The Catch"() {
        when:
        int result = JavaSolution.whoGetsTheCatch(0, 0, [0] as int[], [0] as int[])

        then:
        result == 0
    }

    def "test index Of"() {
        when:
        int result = JavaSolution.indexOf([0] as int[], 0)

        then:
        result == 0
    }

    def "test min"() {
        when:
        int result = JavaSolution.min([0] as int[])

        then:
        result == 0
    }

    def "test frequency"() {
        when:
        int result = JavaSolution.frequency([0,1,1,2,3] as int[], 4)
        int result2 = JavaSolution.frequency([0,1,1,2,3] as int[], 0)
        int result3 = JavaSolution.frequency([0,1,1,2,3] as int[], 1)
        int result4 = JavaSolution.frequency([0,1,1,2,3] as int[], -1)

        then:
        result == 0
        result2 == 1
        result3 == 2
        result4 == 0
    }

    def "test main"() {
        when:
        JavaSolution.main(["args"] as String[])

        then:
        false//todo - validate something
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme