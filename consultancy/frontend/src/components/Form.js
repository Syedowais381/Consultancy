import React, { useState } from "react";

export default function Form() {
  const [form, setForm] = useState({ name: "", email: "", message: "" });
  const [sent, setSent] = useState(false);

  const onChange = e => setForm({ ...form, [e.target.name]: e.target.value });
  const onSubmit = e => {
    e.preventDefault();
    setSent(true);
    setTimeout(() => setSent(false), 4000);
  };

  return (
    <form className="contact-form" onSubmit={onSubmit}>
      <input name="name" value={form.name} onChange={onChange} placeholder="Your name" required />
      <input name="email" value={form.email} onChange={onChange} placeholder="Your email" type="email" required />
      <textarea name="message" value={form.message} onChange={onChange} rows="6" placeholder="Your message" required />
      <div className="form-actions">
        <button type="submit" className="btn-primary">Send Message</button>
        {sent && <span className="sent-note">Message sent (demo)</span>}
      </div>
    </form>
  );
}
