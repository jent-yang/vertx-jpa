require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.jpa.Query
module VertxJpa
  class Query
    # @private
    # @param j_del [::VertxJpa::Query] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxJpa::Query] the underlying java delegate
    def j_del
      @j_del
    end
    @@j_api_type = Object.new
    def @@j_api_type.accept?(obj)
      obj.class == Query
    end
    def @@j_api_type.wrap(obj)
      Query.new(obj)
    end
    def @@j_api_type.unwrap(obj)
      obj.j_del
    end
    def self.j_api_type
      @@j_api_type
    end
    def self.j_class
      Java::IoVertxExtJpa::Query.java_class
    end
    # @yield 
    # @return [self]
    def get_result_list
      if block_given?
        @j_del.java_method(:getResultList, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result != nil ? JSON.parse(ar.result.encode) : nil : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_result_list()"
    end
    # @yield 
    # @return [self]
    def get_single_result
      if block_given?
        @j_del.java_method(:getSingleResult, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result != nil ? JSON.parse(ar.result.encode) : nil : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_single_result()"
    end
    # @yield 
    # @return [self]
    def execute_update
      if block_given?
        @j_del.java_method(:executeUpdate, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling execute_update()"
    end
    # @param [Fixnum] maxResult 
    # @return [self]
    def set_max_results(maxResult=nil)
      if maxResult.class == Fixnum && !block_given?
        @j_del.java_method(:setMaxResults, [Java::int.java_class]).call(maxResult)
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set_max_results(#{maxResult})"
    end
    # @param [Fixnum] startPosition 
    # @return [self]
    def set_first_result(startPosition=nil)
      if startPosition.class == Fixnum && !block_given?
        @j_del.java_method(:setFirstResult, [Java::int.java_class]).call(startPosition)
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set_first_result(#{startPosition})"
    end
    # @param [String] hintName 
    # @param [Object] value 
    # @return [self]
    def set_hint(hintName=nil,value=nil)
      if hintName.class == String && ::Vertx::Util::unknown_type.accept?(value) && !block_given?
        @j_del.java_method(:setHint, [Java::java.lang.String.java_class,Java::java.lang.Object.java_class]).call(hintName,::Vertx::Util::Utils.to_object(value))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set_hint(#{hintName},#{value})"
    end
    # @overload setParameter(name,value)
    #   @param [String] name 
    #   @param [Object] value 
    # @overload setParameter(position,value)
    #   @param [Fixnum] position 
    #   @param [Object] value 
    # @return [self]
    def set_parameter(param_1=nil,param_2=nil)
      if param_1.class == String && ::Vertx::Util::unknown_type.accept?(param_2) && !block_given?
        @j_del.java_method(:setParameter, [Java::java.lang.String.java_class,Java::java.lang.Object.java_class]).call(param_1,::Vertx::Util::Utils.to_object(param_2))
        return self
      elsif param_1.class == Fixnum && ::Vertx::Util::unknown_type.accept?(param_2) && !block_given?
        @j_del.java_method(:setParameter, [Java::int.java_class,Java::java.lang.Object.java_class]).call(param_1,::Vertx::Util::Utils.to_object(param_2))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set_parameter(#{param_1},#{param_2})"
    end
    # @param [:COMMIT,:AUTO] flushMode 
    # @return [self]
    def set_flush_mode(flushMode=nil)
      if flushMode.class == Symbol && !block_given?
        @j_del.java_method(:setFlushMode, [Java::IoVertxExtJpa::FlushModeType.java_class]).call(Java::IoVertxExtJpa::FlushModeType.valueOf(flushMode))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set_flush_mode(#{flushMode})"
    end
    # @param [:READ,:WRITE,:OPTIMISTIC,:OPTIMISTIC_FORCE_INCREMENT,:PESSIMISTIC_READ,:PESSIMISTIC_WRITE,:PESSIMISTIC_FORCE_INCREMENT,:NONE] lockMode 
    # @return [self]
    def set_lock_mode(lockMode=nil)
      if lockMode.class == Symbol && !block_given?
        @j_del.java_method(:setLockMode, [Java::IoVertxExtJpa::LockModeType.java_class]).call(Java::IoVertxExtJpa::LockModeType.valueOf(lockMode))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set_lock_mode(#{lockMode})"
    end
  end
end
