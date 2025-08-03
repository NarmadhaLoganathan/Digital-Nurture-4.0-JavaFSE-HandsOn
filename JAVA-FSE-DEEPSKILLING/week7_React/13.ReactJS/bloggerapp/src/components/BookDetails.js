import React from 'react';

function BookDetails({ books }) {
  return (
    <div className="column">
      <h2>Book Details</h2>
      {books.map((book, index) => (
        <div key={index}>
          <strong>{book.title}</strong>
          <p>{book.price}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
