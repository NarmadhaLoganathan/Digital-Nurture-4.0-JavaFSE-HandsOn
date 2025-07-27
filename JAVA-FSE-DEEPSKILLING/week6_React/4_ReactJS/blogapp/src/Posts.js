import React from 'react';
import Post from './Post';

function Posts() {
  const blogPosts = [
    {
      id: 1,
      title: "My First Blog Post",
      body: "Welcome to my first post! In this post, I’ll share what this blog is about and what you can expect from it.",
    },
    {
      id: 2,
      title: "Learning React is Fun",
      body: "React helps build modern websites. It uses components, and it's super fast and easy to learn!",
    },
    {

      id: 3,
      title: "My College Journey",
      body: "My college life is full of learning and fun. I enjoy coding, participating in events, and working on projects.",
    },


  ];

  return (
    <div>
      {blogPosts.map((post) => (
        <Post key={post.id} title={post.title} body={post.body} />
      ))}
    </div>
  );
}

export default Posts;
