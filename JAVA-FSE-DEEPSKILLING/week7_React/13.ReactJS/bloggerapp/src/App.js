import React from 'react';
import './App.css';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  const courses = [
    { name: "Angular", date: "4/5/2021" },
    { name: "React", date: "6/3/20201" }
  ];

  const books = [
    { title: "Master React", price: 670 },
    { title: "Deep Dive into Angular 11", price: 800 },
    { title: "Mongo Essentials", price: 450 }
  ];

  const blogs = [
    {
      heading: "React Learning",
      author: "Stephen Biz",
      content: "Welcome to learning React!"
    },
    {
      heading: "Installation",
      author: "Schewzdenier",
      content: "You can install React from npm."
    }
  ];

  return (
    <div className="App">
      <div className="container">
        <CourseDetails courses={courses} />
        <BookDetails books={books} />
        <BlogDetails blogs={blogs} />
      </div>
    </div>
  );
}

export default App;
