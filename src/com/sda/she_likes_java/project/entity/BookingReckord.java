package com.sda.she_likes_java.project.entity;

import java.time.LocalDate;
import java.util.Objects;

public class BookingReckord {
    private Long bookingId;
    private User user;
    private Car bookedCar;
    private LocalDate startDate;
    private LocalDate endDate;
    //use BigDecimal in future
    private long priceInEURCents;
    private boolean isPaid;

    private PayingMethod payingMethod;

    public BookingReckord(Long bookingId, User user, Car bookedCar, LocalDate startDate, LocalDate endDate, long priceInEURCents, boolean isPaid, PayingMethod payingMethod) {
        this.bookingId = bookingId;
        this.user = user;
        this.bookedCar = bookedCar;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceInEURCents = priceInEURCents;
        this.isPaid = isPaid;
        this.payingMethod = payingMethod;
    }

    @Override
    public String toString() {
        return "BookingReckord{" +
                "bookingId=" + bookingId +
                ", user=" + user +
                ", bookedCar=" + bookedCar +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", priceInEURCents=" + priceInEURCents +
                ", isPaid=" + isPaid +
                ", payingMethod=" + payingMethod +
                '}';
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getBookedCar() {
        return bookedCar;
    }

    public void setBookedCar(Car bookedCar) {
        this.bookedCar = bookedCar;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public long getPriceInEURCents() {
        return priceInEURCents;
    }

    public void setPriceInEURCents(long priceInEURCents) {
        this.priceInEURCents = priceInEURCents;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public PayingMethod getPayingMethod() {
        return payingMethod;
    }

    public void setPayingMethod(PayingMethod payingMethod) {
        this.payingMethod = payingMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingReckord that = (BookingReckord) o;
        return priceInEURCents == that.priceInEURCents && isPaid == that.isPaid && Objects.equals(bookingId, that.bookingId) && Objects.equals(user, that.user) && Objects.equals(bookedCar, that.bookedCar) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && payingMethod == that.payingMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, user, bookedCar, startDate, endDate, priceInEURCents, isPaid, payingMethod);
    }
}
