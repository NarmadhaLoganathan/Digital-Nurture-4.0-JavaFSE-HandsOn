import React from 'react';

function BlogDetails({ blogs }) {
  return (
    <div className="column">
      <h2>Blog Details</h2>
      {blogs.map((blog, index) => (
        <div key={index}>
          <strong>{blog.heading}</strong>
          <p><i>{blog.author}</i></p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
