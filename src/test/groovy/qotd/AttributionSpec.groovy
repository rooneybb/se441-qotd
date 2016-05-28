package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Attribution)
class AttributionSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for valid attribution name"() {
		when: 'name is empty'
		def p = new Attribution(name: '')

		then: 'validation should fail'
		!p.validate()
		}
		
	def "test for null attribution name"(){
		when: 'name is null'
			def x = null
		
		then: 'validation should fail'
			assert x == null
	}
		
	def "test for legal name"(){
		when: 'name is legal'
			def x = new Attribution(name: 'legal') 
		
		then:
			x.validate();
		}

}



