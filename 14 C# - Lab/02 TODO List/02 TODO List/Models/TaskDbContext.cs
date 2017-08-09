namespace _02_TODO_List.Models
{
    using System;
    using System.Data.Entity;
    using System.Linq;

    public class TaskDbContext : DbContext
    {
        public TaskDbContext()
            : base("name=TaskDbContext")
        {

        }

        public virtual DbSet<Task> Tasks { get; set; }
    }
}