require 'vertx-jpa/entity_manager_ext'
require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.jpa.EntityManagerProvider
module VertxJpa
  #  An asynchronous client interface for interacting with a JDBC compliant
  #  database`using JPA
  class EntityManagerProvider
    # @private
    # @param j_del [::VertxJpa::EntityManagerProvider] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxJpa::EntityManagerProvider] the underlying java delegate
    def j_del
      @j_del
    end
    @@j_api_type = Object.new
    def @@j_api_type.accept?(obj)
      obj.class == EntityManagerProvider
    end
    def @@j_api_type.wrap(obj)
      EntityManagerProvider.new(obj)
    end
    def @@j_api_type.unwrap(obj)
      obj.j_del
    end
    def self.j_api_type
      @@j_api_type
    end
    def self.j_class
      Java::IoVertxExtJpa::EntityManagerProvider.java_class
    end
    # @yield 
    # @return [self]
    def get_entity_manager
      if block_given?
        @j_del.java_method(:getEntityManager, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxJpa::EntityManagerExt) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_entity_manager()"
    end
  end
end
