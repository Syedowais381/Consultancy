import React from "react";
import Form from "../components/Form";

export default function Contact() {
  return (
    <section className="container contact-page">
      <h2>Contact Us</h2>
      <div className="contact-grid">
        <div className="contact-left">
          <h3>Office (UK)</h3>
          <p>Unit 4, Industrial Park, London, UK</p>
          <p>Email: oquadri381@gmail.com</p>
          <p>Phone: +91 6362946800</p>
        </div>
        <div className="contact-right">
          <Form />
        </div>
      </div>
    </section>
  );
}
