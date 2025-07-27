import React from 'react';
import './Post.css';

function Post(props) {
  return (
    <div className="post">
      <h3>{props.title}</h3>
      <p>{props.body}</p>
    </div>
  );
}

export default Post;
