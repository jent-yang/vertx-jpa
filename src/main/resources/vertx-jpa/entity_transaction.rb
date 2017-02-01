require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.jpa.EntityTransaction
module VertxJpa
  class EntityTransaction
    # @private
    # @param j_del [::VertxJpa::EntityTransaction] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxJpa::EntityTransaction] the underlying java delegate
    def j_del
      @j_del
    end
    @@j_api_type = Object.new
    def @@j_api_type.accept?(obj)
      obj.class == EntityTransaction
    end
    def @@j_api_type.wrap(obj)
      EntityTransaction.new(obj)
    end
    def @@j_api_type.unwrap(obj)
      obj.j_del
    end
    def self.j_api_type
      @@j_api_type
    end
    def self.j_class
      Java::IoVertxExtJpa::EntityTransaction.java_class
    end
    #  Start a resource transaction.
    # @return [void]
    def begin
      if !block_given?
        return @j_del.java_method(:begin, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling begin()"
    end
    #  Commit the current resource transaction, writing any unflushed changes to
    #  the database.
    # @return [void]
    def commit
      if !block_given?
        return @j_del.java_method(:commit, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling commit()"
    end
    #  Roll back the current resource transaction.
    # @return [void]
    def rollback
      if !block_given?
        return @j_del.java_method(:rollback, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling rollback()"
    end
    #  Mark the current resource transaction so that the only possible outcome of
    #  the transaction is for the transaction to be rolled back.
    # @return [void]
    def set_rollback_only
      if !block_given?
        return @j_del.java_method(:setRollbackOnly, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling set_rollback_only()"
    end
    #  Determine whether the current resource transaction has been marked for
    #  rollback.
    # @return [true,false] boolean indicating whether the transaction has been marked for rollback
    def get_rollback_only?
      if !block_given?
        return @j_del.java_method(:getRollbackOnly, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling get_rollback_only?()"
    end
    #  Indicate whether a resource transaction is in progress.
    # @return [true,false] boolean indicating whether transaction is in progress
    def active?
      if !block_given?
        return @j_del.java_method(:isActive, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling active?()"
    end
  end
end
