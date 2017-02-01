require 'vertx-jpa/entity_transaction'
require 'vertx-jpa/stored_procedure_query'
require 'vertx-jpa/query'
require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.jpa.EntityManagerExt
module VertxJpa
  class EntityManagerExt
    # @private
    # @param j_del [::VertxJpa::EntityManagerExt] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxJpa::EntityManagerExt] the underlying java delegate
    def j_del
      @j_del
    end
    @@j_api_type = Object.new
    def @@j_api_type.accept?(obj)
      obj.class == EntityManagerExt
    end
    def @@j_api_type.wrap(obj)
      EntityManagerExt.new(obj)
    end
    def @@j_api_type.unwrap(obj)
      obj.j_del
    end
    def self.j_api_type
      @@j_api_type
    end
    def self.j_class
      Java::IoVertxExtJpa::EntityManagerExt.java_class
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
        @j_del.java_method(:merge, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(entity),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
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
    # @param [String] classname 
    # @param [Object] primaryKey 
    # @yield 
    # @return [self]
    def find(classname=nil,primaryKey=nil)
      if classname.class == String && ::Vertx::Util::unknown_type.accept?(primaryKey) && block_given?
        @j_del.java_method(:find, [Java::java.lang.String.java_class,Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(classname,::Vertx::Util::Utils.to_object(primaryKey),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result != nil ? JSON.parse(ar.result.encode) : nil : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling find(#{classname},#{primaryKey})"
    end
    # @param [String] classname 
    # @param [Object] primaryKey 
    # @yield 
    # @return [self]
    def get_reference(classname=nil,primaryKey=nil)
      if classname.class == String && ::Vertx::Util::unknown_type.accept?(primaryKey) && block_given?
        @j_del.java_method(:getReference, [Java::java.lang.String.java_class,Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(classname,::Vertx::Util::Utils.to_object(primaryKey),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result != nil ? JSON.parse(ar.result.encode) : nil : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_reference(#{classname},#{primaryKey})"
    end
    # @yield 
    # @return [void]
    def flush
      if block_given?
        return @j_del.java_method(:flush, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
      end
      raise ArgumentError, "Invalid arguments when calling flush()"
    end
    # @yield 
    # @return [self]
    def get_flush_mode
      if block_given?
        @j_del.java_method(:getFlushMode, [Java::IoVertxCore::Handler.java_class]).call(nil)
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_flush_mode()"
    end
    # @param [Object] entity 
    # @param [:READ,:WRITE,:OPTIMISTIC,:OPTIMISTIC_FORCE_INCREMENT,:PESSIMISTIC_READ,:PESSIMISTIC_WRITE,:PESSIMISTIC_FORCE_INCREMENT,:NONE] lockMode 
    # @param [Hash{String => Object}] properties 
    # @yield 
    # @return [self]
    def lock(entity=nil,lockMode=nil,properties=nil)
      if ::Vertx::Util::unknown_type.accept?(entity) && lockMode.class == Symbol && block_given? && properties == nil
        @j_del.java_method(:lock, [Java::java.lang.Object.java_class,Java::JavaxPersistence::LockModeType.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(entity),Java::JavaxPersistence::LockModeType.valueOf(lockMode),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      elsif ::Vertx::Util::unknown_type.accept?(entity) && lockMode.class == Symbol && properties.class == Hash && block_given?
        @j_del.java_method(:lock, [Java::java.lang.Object.java_class,Java::JavaxPersistence::LockModeType.java_class,Java::IoVertxCoreJson::JsonObject.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(entity),Java::JavaxPersistence::LockModeType.valueOf(lockMode),::Vertx::Util::Utils.to_json_object(properties),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling lock(#{entity},#{lockMode},#{properties})"
    end
    # @overload refresh(entity,handler)
    #   @param [Object] entity 
    #   @yield 
    # @overload refresh(entity,properties,handler)
    #   @param [Object] entity 
    #   @param [Hash{String => Object}] properties 
    #   @yield 
    # @overload refresh(entity,lockMode,handler)
    #   @param [Object] entity 
    #   @param [:READ,:WRITE,:OPTIMISTIC,:OPTIMISTIC_FORCE_INCREMENT,:PESSIMISTIC_READ,:PESSIMISTIC_WRITE,:PESSIMISTIC_FORCE_INCREMENT,:NONE] lockMode 
    #   @yield 
    # @overload refresh(entity,lockMode,properties,handler)
    #   @param [Object] entity 
    #   @param [:READ,:WRITE,:OPTIMISTIC,:OPTIMISTIC_FORCE_INCREMENT,:PESSIMISTIC_READ,:PESSIMISTIC_WRITE,:PESSIMISTIC_FORCE_INCREMENT,:NONE] lockMode 
    #   @param [Hash{String => Object}] properties 
    #   @yield 
    # @return [self]
    def refresh(param_1=nil,param_2=nil,param_3=nil)
      if ::Vertx::Util::unknown_type.accept?(param_1) && block_given? && param_2 == nil && param_3 == nil
        @j_del.java_method(:refresh, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(param_1),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      elsif ::Vertx::Util::unknown_type.accept?(param_1) && param_2.class == Hash && block_given? && param_3 == nil
        @j_del.java_method(:refresh, [Java::java.lang.Object.java_class,Java::IoVertxCoreJson::JsonObject.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(param_1),::Vertx::Util::Utils.to_json_object(param_2),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      elsif ::Vertx::Util::unknown_type.accept?(param_1) && param_2.class == Symbol && block_given? && param_3 == nil
        @j_del.java_method(:refresh, [Java::java.lang.Object.java_class,Java::JavaxPersistence::LockModeType.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(param_1),Java::JavaxPersistence::LockModeType.valueOf(param_2),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      elsif ::Vertx::Util::unknown_type.accept?(param_1) && param_2.class == Symbol && param_3.class == Hash && block_given?
        @j_del.java_method(:refresh, [Java::java.lang.Object.java_class,Java::JavaxPersistence::LockModeType.java_class,Java::IoVertxCoreJson::JsonObject.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(param_1),Java::JavaxPersistence::LockModeType.valueOf(param_2),::Vertx::Util::Utils.to_json_object(param_3),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling refresh(#{param_1},#{param_2},#{param_3})"
    end
    # @yield 
    # @return [self]
    def clear
      if block_given?
        @j_del.java_method(:clear, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling clear()"
    end
    # @param [Object] entity 
    # @yield 
    # @return [self]
    def detach(entity=nil)
      if ::Vertx::Util::unknown_type.accept?(entity) && block_given?
        @j_del.java_method(:detach, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(entity),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling detach(#{entity})"
    end
    # @param [Object] entity 
    # @yield 
    # @return [self]
    def contains(entity=nil)
      if ::Vertx::Util::unknown_type.accept?(entity) && block_given?
        @j_del.java_method(:contains, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(entity),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling contains(#{entity})"
    end
    # @yield 
    # @return [self]
    def get_lock_mode
      if block_given?
        @j_del.java_method(:getLockMode, [Java::IoVertxCore::Handler.java_class]).call(nil)
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_lock_mode()"
    end
    # @yield 
    # @return [self]
    def get_properties
      if block_given?
        @j_del.java_method(:getProperties, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result != nil ? JSON.parse(ar.result.encode) : nil : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_properties()"
    end
    # @param [String] qlString 
    # @yield 
    # @return [self]
    def create_query(qlString=nil)
      if qlString.class == String && block_given?
        @j_del.java_method(:createQuery, [Java::java.lang.String.java_class,Java::IoVertxCore::Handler.java_class]).call(qlString,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxJpa::Query) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling create_query(#{qlString})"
    end
    # @param [String] name 
    # @yield 
    # @return [self]
    def create_named_query(name=nil)
      if name.class == String && block_given?
        @j_del.java_method(:createNamedQuery, [Java::java.lang.String.java_class,Java::IoVertxCore::Handler.java_class]).call(name,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxJpa::Query) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling create_named_query(#{name})"
    end
    # @param [String] sqlString 
    # @yield 
    # @return [self]
    def create_native_query(sqlString=nil)
      if sqlString.class == String && block_given?
        @j_del.java_method(:createNativeQuery, [Java::java.lang.String.java_class,Java::IoVertxCore::Handler.java_class]).call(sqlString,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxJpa::Query) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling create_native_query(#{sqlString})"
    end
    # @param [String] name 
    # @yield 
    # @return [self]
    def create_named_stored_procedure_query(name=nil)
      if name.class == String && block_given?
        @j_del.java_method(:createNamedStoredProcedureQuery, [Java::java.lang.String.java_class,Java::IoVertxCore::Handler.java_class]).call(name,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxJpa::StoredProcedureQuery) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling create_named_stored_procedure_query(#{name})"
    end
    # @yield 
    # @return [self]
    def is_joined_to_transaction
      if block_given?
        @j_del.java_method(:isJoinedToTransaction, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling is_joined_to_transaction()"
    end
    # @yield 
    # @return [void]
    def close
      if block_given?
        return @j_del.java_method(:close, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
      end
      raise ArgumentError, "Invalid arguments when calling close()"
    end
    # @yield 
    # @return [self]
    def is_open
      if block_given?
        @j_del.java_method(:isOpen, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling is_open()"
    end
  end
end
