package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for valid quote text"() {
		when: 'text is empty'
		def p = new Quote(text: '')

		then: 'validation should fail'
		!p.validate()
		}
		
	def "test for null text"(){
		when: 
			def x = new Quote(text: '12$@ 34')
		
		then: 'validation should fail'
			!x.validate()
	}
		
		def "test for legal text"(){
		when: 'text is legal'
			def x = new Quote(text: 'legal') 
		
		then: 
			x.validate();
		}
	}
	


	


