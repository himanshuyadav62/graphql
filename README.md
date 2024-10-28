# GraphQL Queries and Mutations Example

Test GraphQL queries -  `http://localhost:8080/graphiql`.


---

## Query: Fetch Book by ID

This query retrieves a book by its ID, along with specific details about the book and its author.

### Example Query
```graphql
query GetBookById {
  bookById(id: "1") {
    id
    name
    pageCount
    author {
      firstName
    }
  }
}
```
## Query : Create a Book 

```graphql
mutation CreateBook {
  createBook(authorId: "1", name: "New Book", pageCount: 10) {
    id
    name
    pageCount
    author {
      firstName
    }
  }
}
```
