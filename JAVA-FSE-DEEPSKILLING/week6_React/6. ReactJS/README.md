#  React Trainers App – Routing Hands-On (Lab 6)

Hello! This is my Week 6, Lab 6 React hands-on project where I explored how to **use React Router** to build a multi-page app. The app displays a list of trainers, and by clicking on each name, we can view detailed information about that trainer.

---

##  Objectives

- Learn how to implement **routing** in React using `react-router-dom`.
- Understand how to pass parameters in URLs and extract them using `useParams()`.
- Build a user-friendly UI using routes like:
  - `/` – Home page
  - `/trainers` – List of all trainers
  - `/trainers/:id` – Detailed view of a single trainer

---



##  How I Built It

1. Created a new React app using `npx create-react-app trainersapp`.
2. Installed React Router DOM using `npm install react-router-dom`.
3. Added routing using `<BrowserRouter>`, `<Routes>`, and `<Route>`.
4. Created a static list of 3 trainers and rendered links for each.
5. Used the `useParams` hook to fetch individual trainer details.
6. Styled everything using a simple `App.css`.

---

##  How to Run the App

1. Open terminal in your project root folder.
2. Run:
   ```bash
   npm install
   npm start
   ```
3. Open your browser and go to [http://localhost:3000](http://localhost:3000)

---

##  Output

- Home page with a welcome message.
- Trainers page with 3 clickable trainer names.
- Clicking a name opens detailed trainer info.




