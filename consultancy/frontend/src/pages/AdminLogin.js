import React, { useState } from "react";

export default function AdminLogin() {
  const [values, setValues] = useState({ username: "", password: "" });
  const [msg, setMsg] = useState("");

  const onChange = e => setValues({ ...values, [e.target.name]: e.target.value });
  const onSubmit = e => {
    e.preventDefault();
    setMsg("Demo only: authentication not yet implemented.");
  };

  return (
    <section className="container auth-page">
      <h2>Admin Login</h2>
      <form className="auth-form" onSubmit={onSubmit}>
        <input name="username" placeholder="Username" value={values.username} onChange={onChange} required />
        <input name="password" type="password" placeholder="Password" value={values.password} onChange={onChange} required />
        <div className="form-actions">
          <button className="btn-primary" type="submit">Login (Demo)</button>
          {msg && <p className="muted">{msg}</p>}
        </div>
      </form>
    </section>
  );
}
