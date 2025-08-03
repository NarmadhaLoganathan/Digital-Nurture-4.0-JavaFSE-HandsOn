import React, { Component } from 'react';

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null,
      loading: true,
      error: null
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      this.setState({ user: data.results[0], loading: false });
    } catch (error) {
      this.setState({ error: "Failed to fetch user", loading: false });
    }
  }

  render() {
    const { user, loading, error } = this.state;

    if (loading) return <p>Loading user...</p>;
    if (error) return <p>{error}</p>;

    return (
      <div style={{ textAlign: 'center', marginTop: '40px' }}>
        <h2>User Info</h2>
        <p>
          <strong> Name:</strong> {user.name.first}
        </p>
        <img
          src={user.picture.large}
          alt="User"
          style={{ borderRadius: '50%', marginTop: '10px' }}
        />
      </div>
    );
  }
}

export default Getuser;
