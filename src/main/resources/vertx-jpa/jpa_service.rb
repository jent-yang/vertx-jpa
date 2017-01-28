require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.jpa.JpaService
module VertxJpa
  #  An asynchronous client interface for interacting with a JDBC compliant database`using JPA
  class JpaService
    # @private
    # @param j_del [::VertxJpa::JpaService] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxJpa::JpaService] the underlying java delegate
    def j_del
      @j_del
    end
    @@j_api_type = Object.new
    def @@j_api_type.accept?(obj)
      obj.class == JpaService
    end
    def @@j_api_type.wrap(obj)
      JpaService.new(obj)
    end
    def @@j_api_type.unwrap(obj)
      obj.j_del
    end
    def self.j_api_type
      @@j_api_type
    end
    def self.j_class
      Java::IoVertxExtJpa::JpaService.java_class
    end
    # @return [self]
    def get_entity_manager
      if !block_given?
        @j_del.java_method(:getEntityManager, []).call()
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_entity_manager()"
    end
  end
end
