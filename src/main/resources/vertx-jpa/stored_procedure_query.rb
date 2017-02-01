require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.jpa.StoredProcedureQuery
module VertxJpa
  class StoredProcedureQuery
    # @private
    # @param j_del [::VertxJpa::StoredProcedureQuery] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxJpa::StoredProcedureQuery] the underlying java delegate
    def j_del
      @j_del
    end
    @@j_api_type = Object.new
    def @@j_api_type.accept?(obj)
      obj.class == StoredProcedureQuery
    end
    def @@j_api_type.wrap(obj)
      StoredProcedureQuery.new(obj)
    end
    def @@j_api_type.unwrap(obj)
      obj.j_del
    end
    def self.j_api_type
      @@j_api_type
    end
    def self.j_class
      Java::IoVertxExtJpa::StoredProcedureQuery.java_class
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
    # @yield 
    # @return [self]
    def execute
      if block_given?
        @j_del.java_method(:execute, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling execute()"
    end
    # @yield 
    # @return [void]
    def has_more_results
      if block_given?
        return @j_del.java_method(:hasMoreResults, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
      end
      raise ArgumentError, "Invalid arguments when calling has_more_results()"
    end
    # @yield 
    # @return [void]
    def get_update_count
      if block_given?
        return @j_del.java_method(:getUpdateCount, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
      end
      raise ArgumentError, "Invalid arguments when calling get_update_count()"
    end
  end
end
