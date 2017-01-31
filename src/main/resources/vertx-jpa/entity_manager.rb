require 'vertx-jpa/entity_transaction'
require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.jpa.EntityManager
module VertxJpa
  class EntityManager
    # @private
    # @param j_del [::VertxJpa::EntityManager] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxJpa::EntityManager] the underlying java delegate
    def j_del
      @j_del
    end
    @@j_api_type = Object.new
    def @@j_api_type.accept?(obj)
      obj.class == EntityManager
    end
    def @@j_api_type.wrap(obj)
      EntityManager.new(obj)
    end
    def @@j_api_type.unwrap(obj)
      obj.j_del
    end
    def self.j_api_type
      @@j_api_type
    end
    def self.j_class
      Java::IoVertxExtJpa::EntityManager.java_class
    end
    # @param [Object] entity 
    # @yield 
    # @return [self]
    def persist(entity=nil)
      if ::Vertx::Util::unknown_type.accept?(entity) && block_given?
        @j_del.java_method(:persist, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(entity),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling persist(#{entity})"
    end
    # @param [Object] entity 
    # @yield 
    # @return [self]
    def merge(entity=nil)
      if ::Vertx::Util::unknown_type.accept?(entity) && block_given?
        @j_del.java_method(:merge, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(entity),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.from_object(ar.result) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling merge(#{entity})"
    end
    # @yield 
    # @return [self]
    def get_transaction
      if block_given?
        @j_del.java_method(:getTransaction, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxJpa::EntityTransaction) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_transaction()"
    end
    # @param [Object] entity 
    # @yield 
    # @return [self]
    def remove(entity=nil)
      if ::Vertx::Util::unknown_type.accept?(entity) && block_given?
        @j_del.java_method(:remove, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(entity),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling remove(#{entity})"
    end
  end
end
